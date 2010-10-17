package uk.ac.kmi.microwsmo.client.view;

import uk.ac.kmi.microwsmo.client.util.CSSIconImage;
import uk.ac.kmi.microwsmo.client.util.ComponentID;
import uk.ac.kmi.microwsmo.client.util.ComponentID.AnnotationClass;

/**
 * 
 * @author KMi, The Open University
 */
public final class ServiceStructureTree extends BaseTree {

	private BaseTreeItem hrest;
	private ServiceStructureContextMenu contextMenu;
	
	/**
	 * 
	 */
	public ServiceStructureTree() {
		super(ComponentID.SERVICE_STRUCTURE_TREE);
		initComponents();
		addComponents();
	}
	
	/**
	 * 
	 */
	private void initTree() {
		store.removeAll();
		hrest = new BaseTreeItem(AnnotationClass.TREEROOT, CSSIconImage.ROOT, AnnotationClass.TREEROOT);
		addRootItem(hrest);
	}
	
	/**
	 * Initializes the components.
	 */
	private void initComponents() {
		initTree();
		contextMenu = new ServiceStructureContextMenu();
	}
	
	/**
	 * Adds the components into the container.
	 */
	private void addComponents() {
		setContextMenu(contextMenu);
	}

	@Override
	public void setDefaultState() {
		initTree();
	}
	
	
}
