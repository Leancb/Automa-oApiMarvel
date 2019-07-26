package teste.teste.model;

import java.util.List;

public class TesteApiCharacterDataWrapper {

        private String code;
        private String status;
        private String copyright;
        private String attributionText;
        private String attributionHTML;
        private String etag;
        private TesteApiCharacterDataContainer data;

        public TesteApiCharacterDataWrapper( String code, String status, String copyright,
                                             String attributionText, String attributionHTML,
                                             String etag, TesteApiCharacterDataContainer data) {
            this.code = code;
            this.status = status;
            this.copyright = copyright;
            this.attributionText = attributionText;
            this.attributionHTML = attributionHTML;
            this.etag = etag;
            this.data = data;
        }

        public String getCode() {
            return code;
        }

        public void setCode( String code ) {
            this.code = code;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus( String status ) {
            this.status = status;
        }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright( String copyright ) {
        this.copyright = copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public void setAttributionText( String attributionText ) {
        this.attributionText = attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML( String attributionHTML ) {
        this.attributionHTML = attributionHTML;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag( String etag ) {
        this.etag = etag;
    }

    public TesteApiCharacterDataContainer getData() { return data; }

    public void setData( TesteApiCharacterDataContainer data ) {
        this.data = data;
    }




}


