package com.jack.util;

import com.google.common.base.Joiner;
import com.google.common.base.Strings;

import java.util.Optional;
import java.util.stream.Stream;

public final class CacheUtil {

    public static final String SPLICING_OPERATOR = "_";

    /**
     * 构建缓存标识
     *
     * @param keys
     * @return key
     */
    public static String buildKey(String... keys) {
        Stream.of(keys).forEach(each -> Optional.ofNullable(Joiner.on(SPLICING_OPERATOR)).orElseThrow(() -> new RuntimeException("构建缓存 key 不允许为空")));
        return Joiner.on(SPLICING_OPERATOR).join(keys);
    }

    /**
     * 判断结果是否为空或空的字符串
     *
     * @param cacheVal
     * @return
     */
    public static boolean isNullOrBlank(Object cacheVal) {
        return cacheVal == null || (cacheVal instanceof String && Strings.isNullOrEmpty((String) cacheVal));
    }
}
