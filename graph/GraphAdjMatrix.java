
/**@author     Anurag Goel
 * Graph Adjacency Matrix 
 */
class GraphAdjMatrix{
	private boolean adjMatrix[][];
	private int vertexCount;
	public GraphAdjMatrix(int vertexCount)
	{
		this.vertexCount=vertexCount;
		adjMatrix= new boolean[vertexCount][vertexCount];
	}

	public void addEdge(int i, int j)
	{
		if(i>=0 && i < vertexCount && j >0 && j<vertexCount)
		{
			adjMatrix[i][j]=true;
			adjMatrix[j][i]=true;
		}

	}

	public void removeEdge(int i, int j)
	{
		if(i>=0 && i < vertexCount && j >0 && j<vertexCount)
		{
			adjMatrix[i][j]=false;
			adjMatrix[j][i]=false;
		}
		
	}
	public boolean isEdge(int i, int j)
	{
		if(i>=0 && i < vertexCount && j >0 && j<vertexCount)
		{
			return adjMatrix[i][j];
		}
		else 
			return false;
	}
	public static void main(String[] args) {
		
	GraphAdjMatrix graph = new GraphAdjMatrix(4);
	graph.adjMatrix(0,1);
	graph.adjMatrix(1,2);
	graph.adjMatrix(2,3);
	graph.adjMatrix(0,3);
	graph.adjMatrix(2,1);
	}
    
    }