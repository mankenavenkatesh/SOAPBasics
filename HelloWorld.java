
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService(targetNamespace = "http://localhost:9999/ws/hello/wsdl")
@SOAPBinding(style=Style.RPC)
public class HelloWorld
{
	public static void main(String[] args){
		System.out.println("Hello World");
	}

	@WebMethod
	public String getHelloWorldString(String name){
		return "Hello World-"+name;
	}
}
