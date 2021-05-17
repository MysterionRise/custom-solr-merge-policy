# Ideas:

## Custom Merge Policy

Revived old style merge policy, that isn't triggered automatically before with the following config
```
<mergePolicyFactory class="org.mystic.CustomMergePolicyFactory">
  <int name="maxMergeSize">0</int>
</mergePolicyFactory>
```

### How to run it

1. Build package by `mvn clean package`
2. Update *solrconfig.xml* adding custom lib directive
3. Add mergePolicyFactory config from above
4. Start Solr
5. Index a lot of content
6. Run optimize - `http://localhost:8983/solr/test/update?optimize=true&maxSegments=1&waitFlush=false`
7. ???
8. Enjoy!Star!Follow!
