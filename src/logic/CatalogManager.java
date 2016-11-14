package logic;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import model.Product;

@ManagedBean
@ApplicationScoped
public class CatalogManager {

	  private ArrayList<Product> productsList=new ArrayList<Product>();
	  
	  public ArrayList<Product> getProductsList() {
		return(productsList);
	}
	public void setProductsList(ArrayList<Product> productsList) {
		this.productsList = productsList;
	}

	@PostConstruct
	public void initCatalog(){
		productsList.add(new Product(1,"bateau sauvage",50000.5));
		productsList.add(new Product(2,"bateau exotique",70088.5));
		productsList.add(new Product(3,"bateau mandarin",98000.5));
		
	}
	
	
}
