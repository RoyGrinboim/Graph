package dataStructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class DGraph_test {

	@Test
	public void testGetNode() {
		DGraph g = new DGraph();
		Node[] n = new Node[5]; 
		for(int i=0; i<n.length; i++)
		{
			n[i] = new Node(i,i,i,i,i);
			g.addNode(n[i]);
		}
		assertEquals(g.getNode(2), n[2]);
	}

	@Test
	public void testGetV() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetE() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveEdge() {
		fail("Not yet implemented");
	}

	@Test
	public void testNodeSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testEdgeSize() {
		fail("Not yet implemented");
	}

}
