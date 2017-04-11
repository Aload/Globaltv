package com.autism.globaltv.column.view;

import com.autism.globaltv.base.IView;
import com.autism.globaltv.column.model.ColumnListEntity;

/**
 * Author：i5 on 2017/4/11 14:51
 * Used:GlobalTv
 */
public interface ColumnListView extends IView {
    void onColumnListSuccess(ColumnListEntity mList);

    void onColumnFailed(String msg);
}
