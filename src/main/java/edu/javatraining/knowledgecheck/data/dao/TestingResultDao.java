package edu.javatraining.knowledgecheck.data.dao;

import edu.javatraining.knowledgecheck.domain.TestingResults;

import java.util.List;

public interface TestingResultDao {
    void insert(TestingResults testingResults);
    void update(TestingResults testingResults);
    TestingResults find(Long studenId, Long testId);
    List<TestingResults> find(Long testId);
}
