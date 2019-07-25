package teste.teste.model;

import java.util.List;

public class TesteApiModelComicDataContainer {

    private String offset;
    private String limit;
    private String total;
    private String count;
    private List<TesteApiModelComics> results;


    public TesteApiModelComicDataContainer( String offset, String limit, String total, String count, List<TesteApiModelComics>  results ) {
        this.offset = offset;
        this.limit = limit;
        this.total = total;
        this.count = count;
        this.results = results;
    }

    public String getOffset() { return offset;}

    public void setOffset(String getOffset) {this.offset = offset;}

    public String getLimit() { return limit;}

    public void setLimit(String limit) { this.limit = limit; }

    public String getTotal() {return total;}

    public void setTotal(String total) { this.total = total;}

    public String getCount() {return count;}

    public void setCount(String count) { this.count = count;}

    public
    List<TesteApiModelComics> getResults() {return results;}

    public void setResults( List<TesteApiModelComics> results) { this.results = results;}

}
