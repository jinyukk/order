package com.jzy.order.domain;

/**
 * @author jinziyu
 * @date 2020/4/20 0:17
 */
public class DataSourceSwitcher {
    private DataSourceSwitcher() {
    }

    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

    public static final String MASTER = "master";
    public static final String SLAVE = "slave";
    public static final String STAT = "stat";

    public static void setDataSourceType(String dataSourceType) {
        CONTEXT_HOLDER.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return CONTEXT_HOLDER.get();
    }

    public static void clearDataSourceType() {
        CONTEXT_HOLDER.remove();
    }

}
