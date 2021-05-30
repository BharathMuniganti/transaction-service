package com.backbase.mapper;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import com.backbase.dto.BackbaseResponse;
import com.backbase.dto.TransactionDto;

@Mapper(componentModel="spring",unmappedTargetPolicy=ReportingPolicy.IGNORE)
//@Service
public interface BackbaseResponseMapper {

	
	@Mappings({
		
		@Mapping(source="id",target="id"),
		@Mapping(source="thisAccount.id",target="accountId"),
		@Mapping(source="otherAccount.number",target="counterpartyAccount"),
		@Mapping(source="otherAccount.holder.name",target="counterpartyName"),
		@Mapping(source="otherAccount.metadata.imageURL",target="counterPartyLogoPath"),
		@Mapping(source="details.value.amount",target="instructedAmount"),
		@Mapping(source="details.value.currency",target="instructedCurrency"),
		@Mapping(source="details.value.amount",target="transactionAmount"),
		@Mapping(source="details.value.currency",target="transactionCurrency"),
		@Mapping(source="details.type",target="transactionType"),
		@Mapping(source="details.description",target="description")
		
	})
	BackbaseResponse convertToDto(TransactionDto transaction) ;
	
	@IterableMapping(qualifiedByName="convertToDto")
	List<BackbaseResponse> convertToDtoList(List<TransactionDto> transactionList) ;

	
}
