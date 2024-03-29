package com.pectusfinance.financialrecord.service;

import com.pectusfinance.financialrecord.dto.response.ExpansesResponseDto;
import com.pectusfinance.financialrecord.dto.response.PaginatedResponseDto;
import com.pectusfinance.financialrecord.dto.response.SparseDataResponseDto;

import java.math.BigDecimal;
import java.util.List;

public interface ExpansesService {
    PaginatedResponseDto<ExpansesResponseDto> fetchExpanses(int start, int limit);
    List<ExpansesResponseDto> fetchExpansesSorted(int start, int limit, String sortBy);
    List<ExpansesResponseDto> fetchExpansesSortedByOneOrMoreFields(int start, int limit, String field1, String field2);
    List<ExpansesResponseDto> filterByAmountOrMemberName(int start, int limit, Double field1, String field2);
    BigDecimal fetchSumOfExpansesByDepartment(String field);
    SparseDataResponseDto fetchExpansesById(long id);
}
