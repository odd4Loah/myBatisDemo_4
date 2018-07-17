package org.alien.mybatis.samples.service.impl;

import org.alien.mybatis.samples.model.Author;
import org.alien.mybatis.samples.service.AuthorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author lihoo
 * @Title: AuthorServiceImplTest
 * @ProjectName myBatisDemo_4
 * @Description: TODO
 * @date 2018/7/1112:44
 */


public class AuthorServiceImplTest {
    private AuthorService authorService;


    @Before
    public void setUp() throws Exception {
        authorService = new AuthorServiceImpl();
    }

    @Test
    public void testGetAllAuthors() throws Exception {
        Assert.assertEquals(true,authorService.getAllAuthors().size() > 0);
    }

    @Test
    public void getAllAuthorsCount() throws Exception {
        Assert.assertEquals(true,authorService.getAllAuthorsCount() > 0);
    }

    @Test
    public void testAddAuthor() throws Exception {
//        logger.debug("插入测试开始");
        Assert.assertEquals(true,authorService.addAuthor(new Author(15, "发牌员小姐姐")) > 0);
    }

    @Test
    public void testDeleteAuthor() throws Exception {
        Assert.assertEquals(true,authorService.deleteAuthor(10) > 0);
    }

    @Test
    public void testUpdateAuthor() throws Exception {
        Assert.assertEquals(true,authorService.updateAuthor(new Author(8, "狗子")) > 0);
    }

    @Test
    public void testGetAuthorById() throws Exception {
        authorService.getAuthorById(7).getUsername();
    }
}