package lostAndFound;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

public class ItemController {
	private ItemOwnerView ownerView;
	private ItemUserView userView;
	private ItemSecurityView securityView;
	private ItemResponseView responseView;
	private ItemModel model;
	
	public ItemController(ItemOwnerView ownerView, ItemUserView userView, ItemSecurityView securityView, ItemResponseView responseView, ItemModel model) {
		this.ownerView = ownerView;
		this.userView = userView;
		this.securityView = securityView;
		this.responseView = responseView;
		this.model = model;
		
		ownerView.addSaveListener(new saveListener());
		ownerView.addViewListener(new viewListener());
		userView.addMineListener(new mineListener());
		securityView.addSubmitListener(new submitListener());
	}
	public class saveListener implements ActionListener {
		public void actionPerformed(ActionEvent click) {
			model.setName(ownerView.getName());
			model.setDescription(ownerView.getDescription());
			model.setPlace(ownerView.getPlace());
			System.out.println(model.getName() + " " + model.getDescription() + " " + model.getPlace());
		}
	}
	public class mineListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			// view new response window for this item if available when clicking on mine button 
			// on itemUserView class 
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					securityView.setVisible(true);
				}
			});
		}
	}
	public class viewListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			// view window that contains all responses for this item after clicking on view Responses button
			// on itemOwnerView class
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					responseView.setVisible(true);
				}
			});
		}
	}
	public class submitListener implements ActionListener{
		public void actionPerformed(ActionEvent click) {
			// create object from response object and add it to item responses after click on submit button
			// on ItemSecurityView class
			responseModel rModel = new responseModel(lostAndFoundMVC.curUser, securityView.getAnswer());
			responseView rView = new responseView(rModel);
			responseController rController = new responseController(rModel, rView);
			model.addResponse(rController);
			System.out.println("Done");
		}
		
	}
	public String getName() {
		return model.getName();
	}
	public void setName(String name) {
		model.setName(name);
	}
	public String getDescription() {
		return model.getDescription();
	}
	public void setDescription(String description) {
		model.setDescription(description);
	}
	public String getPlace() {
		return model.getPlace();
	}
	public void setPlace(String place) {
		model.setPlace(place);
	}
	public String getOwnerName() {
		return model.getOwner().getName();
	}
	public String getOwnerEmail() {
		return model.getOwner().getEmail();
	}
}
