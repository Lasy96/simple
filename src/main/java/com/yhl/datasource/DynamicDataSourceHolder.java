package com.yhl.datasource;

/**
 * @author Lasy
 * @date 2018/5/24 16:23
 */
public class DynamicDataSourceHolder {
    //写库对应的数据源key
//    private static final String MASTER = "master";

    /**
     * 写库对应的数据源key
     */
    public static final String MASTER = "master";

    /**
     * 读库对应的数据源key
     */
    private static final String SLAVE = "slave";

    /**
     * 使用ThreadLocal记录当前线程的数据源key
     */
    private static final ThreadLocal<String> HOLDER = new ThreadLocal<String>();

    /**
     * 设置数据源key
     * @param key
     */
    public static void putDataSourceKey(String key) {
        HOLDER.set(key);
        HOLDER.remove();
    }

    /**
     * 获取数据源key
     * @return
     */
    public static String getDataSourceKey() {
        return HOLDER.get();
    }

    /**
     * 标记写库
     */
    public static void markMaster(){
        putDataSourceKey(MASTER);
    }

    /**
     * 标记读库
     */
    public static void markSlave(){
        putDataSourceKey(SLAVE);
    }

    /**
     * 判断是否为主数据库
     */
    public static boolean isMaster() {
        return MASTER.equals(getDataSourceKey());
    }
}
