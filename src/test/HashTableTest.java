import org.junit.Assert;
import org.junit.Test;

public class HashTableTest
{
    @Test
    public void ClassInstantiation()
    {
        HashTable myHashTable = new HashTable<Integer, String>();
        Assert.assertNotNull(myHashTable);
    }
}
