package com.wang.dao;

import java.util.List;

import com.wang.model.Yonghu;

public interface YonghuDao {
	// ��¼
	public List login(Yonghu yonghu);

	// ����
	public void add(Yonghu yonghu);

	// ɾ��
	public void delete(Yonghu yonghu);

	// �޸�
	public void update(Yonghu yonghu);

	// ��ѯ
	public List select(Yonghu yonghu);

	// ��ѯ����
	public List selectAll();

}
