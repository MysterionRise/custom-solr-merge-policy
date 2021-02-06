package org.mystic;

import org.apache.lucene.index.MergePolicy;
import org.apache.solr.core.SolrResourceLoader;
import org.apache.solr.index.MergePolicyFactory;
import org.apache.solr.index.MergePolicyFactoryArgs;
import org.apache.solr.schema.IndexSchema;

public class CustomMergePolicy extends MergePolicyFactory {

    protected CustomMergePolicy(SolrResourceLoader resourceLoader, MergePolicyFactoryArgs args, IndexSchema schema) {
        super(resourceLoader, args, schema);
    }

    public MergePolicy getMergePolicy() {
        return null;
    }
}
