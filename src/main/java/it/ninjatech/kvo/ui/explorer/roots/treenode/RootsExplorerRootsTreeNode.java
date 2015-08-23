package it.ninjatech.kvo.ui.explorer.roots.treenode;

import it.ninjatech.kvo.model.AbstractPathEntity;
import it.ninjatech.kvo.tvserie.TvSeriesPathEntity;
import it.ninjatech.kvo.ui.ImageRetriever;
import it.ninjatech.kvo.ui.explorer.roots.ExplorerRootsController;
import it.ninjatech.kvo.ui.explorer.roots.contextmenu.AbstractExplorerRootsContextMenu;
import it.ninjatech.kvo.util.Labels;

import java.util.Collections;

import javax.swing.Icon;

public class RootsExplorerRootsTreeNode extends AbstractExplorerRootsTreeNode {

	private static final long serialVersionUID = 5537689264346672222L;

	public RootsExplorerRootsTreeNode() {
		super(true, null);
	}
	
	@Override
	public String toString() {
		return Labels.ROOTS;
	}
	
	@Override
	public boolean equals(Object other) {
		return other.getClass().equals(RootsExplorerRootsTreeNode.class);
	}
	
	@Override
	public boolean hasCustomIcon() {
		return true;
	}

	@Override
	public Icon getCustomIcon() {
		return ImageRetriever.retrieveExplorerTreeFolder();
	}
	
	@Override
	public boolean hasContextMenu() {
		return false;
	}
	
	@Override
	public AbstractExplorerRootsContextMenu<RootsExplorerRootsTreeNode> getContextMenu(ExplorerRootsController controller) {
		return null;
	}
	
	@Override
	public boolean isLeaf() {
		return false;
	}

	@Override
	public int compareTo(AbstractExplorerRootsTreeNode other) {
		return 0;
	}
	
	public void addRoot(AbstractPathEntity root) {
		AbstractRootsExplorerRootsTreeNode<?> rootNode = null;
		if (root instanceof TvSeriesPathEntity) {
			rootNode = new TvSeriesExplorerRootsTreeNode((TvSeriesPathEntity)root, this);
		}
		this.children.add(rootNode);
		Collections.sort(this.children);
	}

}
