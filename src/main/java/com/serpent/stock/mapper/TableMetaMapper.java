package com.serpent.stock.mapper;

import com.serpent.stock.dto.ColumnMeta;
import com.serpent.stock.dto.TableMeta;

import java.util.List;

public interface TableMetaMapper {

    TableMeta tableMetaQuery(Integer id);

    List<ColumnMeta> columnMetaQuery(Integer tableId);

    TableMeta selectTableMeta(Integer tableMetaId);

}
