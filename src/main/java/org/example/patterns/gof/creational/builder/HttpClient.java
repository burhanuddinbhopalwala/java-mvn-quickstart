package org.example.patterns.gof.creational.builder;

public class HttpClient {
    private final String method;
    private final String url;
    private final String body;

    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.url = httpClientBuilder.url;
        this.body = httpClientBuilder.body;
        this.method = httpClientBuilder.method;
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

// Nonreadable + No setters required use builder pattern for the same.
//    public HttpClient(String method, String url, String body) {
//        this.url = url;
//        this.body = body;
//        this.method = method;
//    }

    public String getBody() {
        return body;
    }

    public static class HttpClientBuilder {
        private String method;
        private String url;
        private String body;

        public HttpClientBuilder method(String method) {
            this.body = method;
            return this;
        }

        public HttpClientBuilder url(String url) {
            this.url = url;
            return this;
        }

        public HttpClientBuilder body(String method) {
            this.body = body;
            return this;
        }

        public HttpClient build() {
            return new HttpClient(this);
        }

    }
}

// HttpClient httpClient = new HttpClient.HttpClientBuilder.method("POST").url("http://random.com").body("{'msg': 'test'}").build();
