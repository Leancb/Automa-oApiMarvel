package teste.teste.model;

import java.util.List;

public class TesteApiCharacterDataContainer {

    private String offset;
    private String limit;
    private String total;
    private String count;
    private List<TesteApiCharacter> results;


    public TesteApiCharacterDataContainer( String offset, String limit, String total, String count, List<TesteApiCharacter>  results ) {
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

    public List<TesteApiCharacter> getResults() {return results;}

    public void setResults( List<TesteApiCharacter> results) { this.results = results;}

/*
    @Override
    public String toString() {
        return "TesteApiCharacterDataContainer{" +
                "offset='" + offset + '\'' +
                ", limit='" + limit + '\'' +
                ", total='" + total + '\'' +
                ", count='" + count + '\'' +
                ", results='" + results + '\'' +
                '}';
    }
*/

}


