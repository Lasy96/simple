package tk.mybatis.simple.interceptor;

import org.apache.ibatis.session.RowBounds;

/**
 * @author Lasy
 * @date 2018/6/22 13:57
 */
public class PageRowBounds extends RowBounds {
    private long total;

    public PageRowBounds() {
        super();
    }

    public PageRowBounds(int offset, int limit) {
        super(offset, limit);
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
