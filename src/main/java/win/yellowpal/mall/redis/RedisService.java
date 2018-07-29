package win.yellowpal.mall.redis;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Resource(name = "stringRedisTemplate")
	ValueOperations<String, String> valOpsStr;

	@Autowired
	RedisTemplate<Object, Object> redisTemplate;

	@Resource(name = "redisTemplate")
	ValueOperations<Object, Object> valOpsObj;

	/**
	 * 根据指定key获取String
	 * 
	 * @param key
	 * @return
	 */
	public String getStr(String key) {
		return valOpsStr.get(key);
	}

	/**
	 * 设置Str缓存
	 * 
	 * @param key
	 * @param val
	 */
	public void setStr(String key, String val) {
		valOpsStr.set(key, val);
	}

	/**
	 * 删除指定key
	 * 
	 * @param key
	 */
	public void del(String key) {
		stringRedisTemplate.delete(key);
	}

	/**
	 * 根据指定o获取Object
	 * 
	 * @param key
	 * @return
	 */
	public Object getObj(Object key) {
		return valOpsObj.get(key);
	}

	/**
	 * 设置obj缓存
	 * 
	 * @param key
	 * @param value
	 */
	public void setObj(Object key, Object value) {
		valOpsObj.set(key, value);
	}

	/**
	 * 删除Obj缓存
	 * 
	 * @param key
	 */
	public void delObj(Object key) {
		redisTemplate.delete(key);
	}
}
