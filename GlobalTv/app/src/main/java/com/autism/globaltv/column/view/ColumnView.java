package com.autism.globaltv.column.view;

import com.autism.globaltv.base.IView;
import com.autism.globaltv.column.model.ColumnEntity;

import java.util.List;

/**
 * Author：i5 on 2017/4/6 13:17
 * Used:GlobalTv
 */
public interface ColumnView extends IView {
    void onColumnListSuccess(List<ColumnEntity> mData);

    void onFailed(String msg);
}
