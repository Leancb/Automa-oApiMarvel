package teste.teste.model;

public class TesteApiModelCaracters {

        private String code;
        private String status;
        private String etag;

        public TesteApiModelCaracters( String code, String status, String etag ) {
            this.code = code;
            this.status = status;
            this.etag = etag;
        }

        public String getCode() {
            return code;
        }

        public void setCode( String code ) {
            this.code = code;
        }

        public String getStatus() { return status; }

        public void setStatus( String status ) {
            this.status = status;
        }

        public String getEtag() { return etag;}

        public void setEtag ( String etag ) { this.etag = etag;}



        @Override
        public String toString() {
            return "TesteApiModelCaracters{" +
                    "code='" + code + '\'' +
                    ", status='" + status + '\'' +
                    ", etag='" + etag + '\'' +
                    '}';
        }
    }


