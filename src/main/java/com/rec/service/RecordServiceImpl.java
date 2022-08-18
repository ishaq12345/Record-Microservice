package com.rec.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rec.entity.Record;

@Service
public class RecordServiceImpl implements IRecordService {
	
	//dummy List of record
	List<Record> list=List.of(
			new Record(1L,"tata@gmail.com","Tata Motors",1311L),
			new Record(2L,"mahindra@gmail.com","Mahindra Motors",1311L),
			new Record(3L,"ford@gmail.com","Ford Motors",1312L),
			new Record(4L,"suzuki@gmail.com","Suzuki Motors",1312L),
			new Record(5L,"chevrolet@gmail.com","Chevrolet Motors",1313L),
			new Record(6L,"jaguar@gmail.com","Jagura Motors",1314L),
			new Record(7L,"rangerover@gmail.com","RangeRover Motors",1315L),
			new Record(8L,"hyundai@gmail.com","Hyundai Motors",1316L),
			new Record(9L,"mercedes@gmail.com","Merc Motors",1317L),
			new Record(10L,"bmw@gmail.com","BMW Motors",1318L)
			
			);
@Override
public List<Record> getRecordOfEmployee(Long eId) {
	return list.stream().filter(record -> record.geteId().equals(eId)).collect(Collectors.toList());
}
}
