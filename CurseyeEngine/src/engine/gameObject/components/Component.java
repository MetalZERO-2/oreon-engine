package engine.gameObject.components;

import engine.core.Transform;
import engine.gameObject.GameObject;

public abstract class Component{
	
	private GameObject parent;
	
	public void update(){};
	
	public void input(){};
	
	public void render(){};

	public GameObject getParent() {
		return parent;
	}

	public void setParent(GameObject parent) {
		this.parent = parent;
	}

	public Transform getTransform()
	{
		return getParent().getTransform();
	}
}