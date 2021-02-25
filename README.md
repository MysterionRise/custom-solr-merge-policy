# Ideas:

1. Custom Merge Policy (executable by cron)
2. Different pull strategies (TLOG + PULL)


  1. Run `docker-compose -f docker-compose.yml up`
  2. POST request `http://localhost:8983/solr/admin/collections?action=CREATE&name=test_coll&numShards=1&nrtReplicas=0&tlogReplicas=1&pullReplicas=2`
  3. GET request `http://localhost:8983/solr/test_coll/select?q=*%3A*&shards.preference=replica.type:PULL`
