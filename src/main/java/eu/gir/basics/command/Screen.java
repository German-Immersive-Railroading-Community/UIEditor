package eu.gir.basics.command;

import eu.gir.girsignals.guis.guilib.GuiBase;
import eu.gir.girsignals.guis.guilib.GuiElements.UIButton;
import eu.gir.girsignals.guis.guilib.GuiElements.UIClickable;
import eu.gir.girsignals.guis.guilib.GuiElements.UIEntity;
import eu.gir.girsignals.guis.guilib.GuiElements.UILabel;
import eu.gir.girsignals.guis.guilib.GuiElements.UIVBox;

public class Screen extends GuiBase {

	public Screen() {
		super("TestName");
	}

	@Override
	public void onGuiClosed() {
		super.onGuiClosed();
	}

	@Override
	public void initGui() {
		super.initGui();
		
		UIEntity rightEntity = new UIEntity();
		UIEntity leftEntity = new UIEntity();
		UIEntity newButtonEntity = new UIEntity();
		UIEntity previewButtonEntity = new UIEntity();
		UIEntity entityList = new UIEntity();
		UIEntity sidedEntitys = new UIEntity();

		UIVBox leftVbox = new UIVBox(4);
		leftEntity.setBounds(Math.round(entity.getWidth() / 3), entity.getHeight());
		leftEntity.add(leftVbox);
//		UIColor leftColor = new UIColor(0xFF0000FF);
//		leftEntity.add(leftColor);

		newButtonEntity.setBounds(35, 20);
		UIButton newButton = new UIButton("New");
		newButtonEntity.add(newButton);
		UIClickable newButtonClickable = new UIClickable(e -> {
			testButton(entityList);
		});
		newButtonEntity.add(newButtonClickable);
		leftEntity.add(newButtonEntity);

		previewButtonEntity.setBounds(50, 20);
		UIButton previewButton = new UIButton("Preview");
		previewButtonEntity.add(previewButton);
		leftEntity.add(previewButtonEntity);

		rightEntity.setBounds(Math.round(entity.getWidth() / 3 * 2), entity.getHeight());
		rightEntity.setPos(leftEntity.getWidth(), rightEntity.getY());
//		UIColor rightColor = new UIColor(0xF00000FF);
//		rightEntity.add(rightColor);

		entityList.setBounds(Math.round(rightEntity.getWidth() / 2), rightEntity.getHeight());
		UIVBox entityListBox = new UIVBox(2);
		entityList.add(entityListBox);
		UIEntity entityTitleEntity = new UIEntity();
		UILabel entityTitle = new UILabel("Entitys");
		entityTitleEntity.add(entityTitle);
		entityList.add(entityTitleEntity);
//		UIColor entityListColor = new UIColor(0xFF0000FF);
//		entityList.add(entityListColor);

		UIEntity propertyList = new UIEntity();
		propertyList.setBounds(Math.round(rightEntity.getWidth() / 2), rightEntity.getHeight());
		propertyList.setPos(propertyList.getX() + Math.round(rightEntity.getWidth() / 2), propertyList.getY());
//		UIColor propertyListColor = new UIColor(0xF00000FF);
//		propertyList.add(propertyListColor);
		rightEntity.add(propertyList);
		rightEntity.add(entityList);

		sidedEntitys.add(rightEntity);
		sidedEntitys.add(leftEntity);
		entity.add(sidedEntitys);

	}

	private void testButton(UIEntity rootEntity) {
		UIEntity testButtonEntity = new UIEntity();
		testButtonEntity.setBounds(65, 20);
		UIButton testButton = new UIButton("Testbutton");
		testButtonEntity.add(testButton);
		rootEntity.add(testButtonEntity);

	}

}
