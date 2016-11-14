package somepackage;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.*;

import model.Product;

@ManagedBean
@ApplicationScoped
public class SomeBean {
  private String someProperty = "Blah, blah";
  private ArrayList<Product> productsList=new ArrayList<Product>();
  
  public ArrayList<Product> getProductsList() {
	return(productsList);
}
public void setProductsList(ArrayList<Product> productsList) {
	this.productsList = productsList;
}

  public String getSomeProperty() {
    return(someProperty);
  }

  public void setSomeProperty(String someProperty) {
    this.someProperty = someProperty;
  }
  
  public String someActionControllerMethod() {
    return("page-b");  // Means to go to page-b.xhtml (since condition is not mapped in faces-config.xml)
  }
  
  public String someOtherActionControllerMethod() {
    return("index");  // Means to go to index.xhtml (since condition is not mapped in faces-config.xml)
  }

	@PostConstruct
	public void initCatalog(){
		productsList.add(new Product(1,"bateau sauvage",50000.5));
		productsList.add(new Product(2,"bateau exotique",70088.5));
		productsList.add(new Product(3,"bateau mandarin",98000.5));
		
	}
}
