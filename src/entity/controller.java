package entity;
import org.springframework.web.client.RestTemplate;



public class controller {
	static String url="http://localhost:8080/Diagnosis_services/ManageUser/getUsers";
	public static void main(String[] args) {
	
	RestTemplate restTemplate= new RestTemplate();
	User[] user=  restTemplate.getForObject(url,User[].class);
	System.out.println(user[0].getUsername());
}	
}
