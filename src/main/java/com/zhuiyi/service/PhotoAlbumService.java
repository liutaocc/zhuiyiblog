package com.zhuiyi.service;

import com.zhuiyi.common.ResponseResult;
import com.zhuiyi.entity.PhotoAlbum;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 相册 服务类
 * </p>
 */
public interface PhotoAlbumService extends IService<PhotoAlbum> {

    ResponseResult listAlbum(String name);

    ResponseResult getAlbumById(Integer id);

    ResponseResult insertAlbum(PhotoAlbum photoAlbum);

    ResponseResult updateAlbum(PhotoAlbum photoAlbum);

    ResponseResult deleteAlbumById(Integer id);





    //web端方法开始
    ResponseResult webAlbumList();

    ResponseResult webListPhotos(Integer albumId);

}
