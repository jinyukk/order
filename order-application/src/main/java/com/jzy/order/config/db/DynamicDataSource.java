package com.jzy.order.config.db;

import com.jzy.order.domain.DataSourceSwitcher;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author jinziyu
 * @date 2020/4/20 0:12
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        if (DataSourceSwitcher.getDataSourceType() == null) {
            return DataSourceSwitcher.MASTER;
        }
        return DataSourceSwitcher.getDataSourceType();
    }
}
