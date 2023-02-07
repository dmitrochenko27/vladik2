package org.example.elastic;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        RestClient restClient = RestClient.builder(
                new HttpHost("localhost", 9200)).build();

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        ElasticsearchTransport transport = new RestClientTransport(
                restClient, new JacksonJsonpMapper(objectMapper));

        ElasticsearchClient elasticsearchClient = new ElasticsearchClient(transport);

        try {
            SearchResponse<Content> searchResponse = elasticsearchClient.search(s -> s
                            .index("find-by-content")
                            .query(q -> q
                                    .matchPhrasePrefix(builder -> builder
                                            .field("content")
                                            .query("рпр"))
                            ),
                    Content.class);

            List<UUID> collect = searchResponse.hits().hits().stream()
                    .map(Hit::source)
                    .filter(Objects::nonNull)
                    .map(Content::getGuid)
                    .collect(Collectors.toList());

            System.out.println(collect);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Content {

        private UUID guid;
        private String content;

        public UUID getGuid() {
            return guid;
        }

        public void setGuid(UUID guid) {
            this.guid = guid;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

}
