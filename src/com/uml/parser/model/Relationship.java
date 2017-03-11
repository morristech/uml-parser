package com.uml.parser.model;
import com.uml.parser.enums.RelationType;

public class Relationship {

	private String parent;
	private String child;
	private RelationType type;
	private String parentCardinality;
	private String childCardinality;
	
	public Relationship() {
		parentCardinality = null;
		childCardinality = null;
	}
	
	/**
	 * @return the parent
	 */
	public String getParent() {
		return parent;
	}
	/**
	 * @param parent the parent to set
	 */
	public void setParent(String parent) {
		this.parent = parent;
	}
	/**
	 * @return the child
	 */
	public String getChild() {
		return child;
	}
	/**
	 * @param child the child to set
	 */
	public void setChild(String child) {
		this.child = child;
	}
	/**
	 * @return the type
	 */
	public RelationType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(RelationType type) {
		this.type = type;
	}
	/**
	 * @return the parentCardinality
	 */
	public String getParentCardinality() {
		return parentCardinality;
	}
	/**
	 * @param parentCardinality the parentCardinality to set
	 */
	public void setParentCardinality(String parentCardinality) {
		this.parentCardinality = parentCardinality;
	}
	/**
	 * @return the childCardinality
	 */
	public String getChildCardinality() {
		return childCardinality;
	}
	/**
	 * @param childCardinality the childCardinality to set
	 */
	public void setChildCardinality(String childCardinality) {
		this.childCardinality = childCardinality;
	}
	
	public String getUMLString(){
		if(parentCardinality != null && childCardinality != null){
			return (parent + "\"" + parentCardinality + "\"" + type.getSymbol() + "\"" + childCardinality + "\"" + child + "\n\n");
		}
		return (parent + type.getSymbol() + child + "\n\n");
	}
}