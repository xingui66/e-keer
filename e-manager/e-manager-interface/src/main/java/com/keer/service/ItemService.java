package com.keer.service;

import com.keer.common.pojo.EasyUIDataGridResult;
import com.keer.pojo.TbItem;

public interface ItemService {
	TbItem getItemById(long item);
	EasyUIDataGridResult getItemList(int page,int rows);

}
