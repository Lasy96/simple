package tk.mybatis.simple.model.rest.param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 袁华
 * @date 2018/4/26
 */
public class Page<T> {
    /**
     * 页数
     */
    private int page;
    /**
     * 条数
     */
    private int pageSize;
    /**
     * 总记录数
     */
    private int totalRecord;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 当前页记录
     */
    private List<T> results;
    private Map<String, Object> params = new HashMap<String, Object>();

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Page [pageNo=").append(page).append(", pageSize=").
                append(pageSize).append(", results=").append(results).
                append(", totalPage=").append(totalPage).append(", totalRecord=").
                append(totalRecord).append("]");
        return builder.toString();
    }
}
