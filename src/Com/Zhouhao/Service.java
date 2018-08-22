package Com.Zhouhao;

public interface Service {
	void method1();
	void method2();
	

}
interface ServiceFactory{
	Service getService();
	
}
