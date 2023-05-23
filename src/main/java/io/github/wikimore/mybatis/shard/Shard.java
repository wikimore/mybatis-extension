package io.github.wikimore.mybatis.shard;

/**
 * @author Ted Wang
 */
public class Shard {
  public String tableSuffix;

  public Shard() {
  }

  public Shard(String shardSuffix) {
    this.tableSuffix = shardSuffix;
  }

  /**
   * @return the tableSuffix
   */
  public String getTableSuffix() {
    return tableSuffix;
  }

  /**
   * @param tableSuffix the tableSuffix to set
   */
  public void setTableSuffix(String tableSuffix) {
    this.tableSuffix = tableSuffix;
  }

  @Override
  public String toString() {
    return "shard[tableSuffix=" + tableSuffix + "]";
  }
}
