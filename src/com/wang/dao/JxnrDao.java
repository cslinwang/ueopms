package com.wang.dao;

import java.util.List;

import com.wang.model.Jxnr;

public interface JxnrDao {

	// ����
	public void add(Jxnr jxnr);

	// ɾ��
	public void delete(Jxnr jxnr);

	// �޸�
	public void update(Jxnr jxnr);

	// ��ѯ
	public List select(Jxnr jxnr);

	// ��ѯ����
	public List selectAll();

}
