package edu.javatraining.knowledgecheck.service.impl;

import edu.javatraining.knowledgecheck.data.dao.TestDao;
import edu.javatraining.knowledgecheck.domain.Test;
import edu.javatraining.knowledgecheck.service.TestService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

public class TestServiceImpl implements TestService {

    private static Logger logger = LogManager.getLogger("Service");

    private TestDao dao;

    public TestServiceImpl(TestDao dao) {
        this.dao = dao;

        logger.trace("TestServiceImpl constructor: TestDao " + this.dao);
    }

    @Override
    public Long insertComplex(Test test) {
        return dao.insertComplex(test);
    }

    @Override
    public Long insertPlain(Test test) {
        return dao.insertPlain(test);
    }

    @Override
    public List<Test> findComplexAll(Long offset, Long count) {
        return dao.findComplexAll(offset, count);
    }

    @Override
    public List<Test> findPlainAll(Long offset, Long count) {
        return dao.findPlainAll(offset, count);
    }

    @Override
    public boolean delete(Test test) {
        return dao.delete(test);
    }

    @Override
    public boolean updateComplex(Test test) {
        return dao.updateComplex(test);
    }

    @Override
    public boolean updatePlain(Test test) {
        return dao.updatePlain(test);
    }

    @Override
    public Test findComplexOneById(Long id) {
        return dao.findComplexOneById(id);
    }

    @Override
    public Test findPlainOneById(Long id) {
        return dao.findPlainOneById(id);
    }

    @Override
    public Map<Long, List<Long>> findCorrectAnswerIdsByTestId(Long testId) {
        return dao.findCorrectAnswerIdsByTestId(testId);
    }

    @Override
    public Long getFilterTutorId() {
        return dao.getFilterTutorId();
    }

    @Override
    public void setFilterTutorId(Long filterTutorId) {
        dao.setFilterTutorId(filterTutorId);
    }

    @Override
    public Long getFilterSubjectId() {
        return dao.getFilterSubjectId();
    }

    @Override
    public void setFilterSubjectId(Long filterSubjectId) {
        dao.setFilterSubjectId(filterSubjectId);
    }

    @Override
    public String getDateOrder() {
        return dao.getDateOrder();
    }

    @Override
    public void setDateOrder(String dateOrder) {
        dao.setDateOrder(dateOrder);
    }

    @Override
    public boolean isUseFilter() {
        return dao.isUseFilter();
    }

    @Override
    public void enableFilter() {
        dao.enableFilter();
    }

    @Override
    public void disableFilter() {
        dao.disableFilter();
    }

    @Override
    public boolean isUseOrder() {
        return dao.isUseOrder();
    }

    @Override
    public void enableOrder() {
        dao.enableOrder();
    }

    @Override
    public void disableOrder() {
        dao.disableOrder();
    }

    @Override
    public void resetFilterAndOrder() {
        dao.resetFilterAndOrder();
    }
}