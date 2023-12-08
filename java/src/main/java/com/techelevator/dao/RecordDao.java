package com.techelevator.dao;

import com.techelevator.model.Record;

import java.util.List;

public interface RecordDao {

    List<Record> getRecordsByCollectionId(int id);

    List<Record> getRecordsByUserId(int userId);

    Record getRecordById(int recordId);

    Record createRecord(Record record);


}
