package com.wang.service;

import java.util.List;

import com.wang.model.Yonghu;

public interface YonghuService {
	// ��½
	public Yonghu login(Yonghu yonghu);

	// ����
	public boolean add(Yonghu yonghu);

	// ɾ��
	public boolean delete(Yonghu yonghu);

	// �޸�
	public boolean update(Yonghu yonghu);

	// ��ѯ
	public Yonghu select(Yonghu yonghu);

	// ��ѯ����
	public List selectAll();

}
