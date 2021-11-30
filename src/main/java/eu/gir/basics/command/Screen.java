package eu.gir.basics.command;

import eu.gir.girsignals.guis.guilib.GuiBase;
import eu.gir.girsignals.guis.guilib.GuiElements.UIButton;
import eu.gir.girsignals.guis.guilib.GuiElements.UIEntity;
import eu.gir.girsignals.guis.guilib.GuiElements.UIVBox;
import eu.gir.girsignals.guis.guilib.UIColor;

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

		UIVBox leftVbox = new UIVBox(4);
		UIEntity leftEntity = new UIEntity();
		leftEntity.setBounds(Math.round(entity.getWidth() / 3), entity.getHeight());
		leftEntity.add(leftVbox);
		entity.add(leftEntity);

		UIEntity newButtonEntity = new UIEntity();
		newButtonEntity.setBounds(35, 20);
		UIButton newButton = new UIButton("New");
		newButtonEntity.add(newButton);
		leftEntity.add(newButtonEntity);

		UIEntity previewButtonEntity = new UIEntity();
		previewButtonEntity.setBounds(50, 20);
		UIButton previewButton = new UIButton("Preview");
		previewButtonEntity.add(previewButton);
		leftEntity.add(previewButtonEntity);

		UIEntity rightEntity = new UIEntity();
		rightEntity.setBounds(Math.round(entity.getWidth() / 3 * 2), entity.getHeight());

		UIEntity entityList = new UIEntity();
		entityList.setBounds(Math.round(rightEntity.getWidth() / 2), rightEntity.getHeight());
		UIVBox entityListBox = new UIVBox(2);
		entityList.add(entityListBox);
		UIEntity propertyList = new UIEntity();
		propertyList.setBounds(Math.round(rightEntity.getWidth() / 2), rightEntity.getHeight());
		propertyList.setPos(propertyList.getX() + Math.round(rightEntity.getWidth() / 2), propertyList.getY());
//		UIEntity testButtonEntity = new UIEntity();
//		testButtonEntity.setBounds(60, 20);
//		UIButton testButton = new UIButton("Testbutton");
//		testButtonEntity.add(testButton);
//		propertyList.add(testButtonEntity);
		testButton(propertyList);
		testButton(entityList);
		rightEntity.add(propertyList);
		rightEntity.add(entityList);

		UIEntity sidedEntitys = new UIEntity();
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
