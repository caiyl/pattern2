package simplefactory;

/**
 * Created by caiyl on 2016/12/17.
 * �򵥹���ģʽ��Ƶ�������ɫ�������Ʒ��ɫ�Լ������Ʒ��ɫ
 *
 * �����ࣨGreatro)��ɫ�����������ɫ���ǹ�������ģʽ�ĺ��ģ�������Ӧ�ý��ܵ���ص���ҵ�߼���
 * �������ڿͻ��˵�ֱ�ӵ����´�����Ʒ������������һ�������java��ʵ�֡�
 */
public class Greator {
    public static Product factory(){
        return new ConcreteProduct();
    }
}
