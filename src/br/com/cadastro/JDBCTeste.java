package br.com.cadastro;

import org.junit.Assert;
import org.junit.Test;

public class JDBCTeste {


    CrudTeste cm = new CrudTeste();
        CadastroEstudantil list = new CadastroEstudantil();
        @Test
        public void testInsert(){

            Assert.assertNotNull(list.getNome());
            Assert.assertNotNull(list.getEmail());
            Assert.assertNotNull(list.getCpf());
            Assert.assertNotNull(list.getStartDate());
        }
        @Test
        public void testUpdate(){

            Assert.assertEquals("2",list.getId());
        }
        @Test
        public void testDelete(){

            //Assertions.assertNotNull(list.getId());
        }
        @Test
        public void testSelect(){

        }
    }

