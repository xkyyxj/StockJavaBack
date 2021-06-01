package com.cassiopeia.stock.mapper;

import com.cassiopeia.stock.dto.ColumnMeta;
import com.cassiopeia.stock.dto.TableMeta;

import java.util.List;

public interface TableMetaMapper {

    TableMeta tableMetaQuery(Integer id);

    List<ColumnMeta> columnMetaQuery(Integer tableId);

    TableMeta selectTableMeta(Integer tableMetaId);

}
