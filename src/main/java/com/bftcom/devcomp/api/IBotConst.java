package com.bftcom.devcomp.api;

/**
 * ���������
 */
public interface IBotConst {
  // �������� ��������
  String QUEUE_SERVICE_PREFIX = "SERVICE_QUEUE_";   // �������, ������� ������� ������
  String QUEUE_ADAPTER_PREFIX = "ADAPTER_QUEUE_";   // �������, ������� ������� ��������
  String QUEUE_BOT_PREFIX = "BOT_QUEUE_";       // �������, ������� ������� ���������� ���������

  // ����� ��������� ���������, ������������ � ���������
  String PROP_ADAPTER_NAME = "ADAPTER_NAME";                // ��������, ������������ ��� ��������
  String PROP_BOT_NAME = "BOT_NAME";                    // ��������, ������������ ��� ���������� ��������
  String PROP_USER_NAME = "USER_NAME";                      // ��������, ������������ ��� ������������

  // ����� ��������������� ���������, ������������ � ���������
  String PROP_BODY_TEXT = "BODY_TEXT";                // ��������, ������������ �����, ������������ �� ���� � ������� (����� ���������)

}
