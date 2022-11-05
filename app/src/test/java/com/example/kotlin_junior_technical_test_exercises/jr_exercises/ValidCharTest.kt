package com.example.kotlin_junior_technical_test_exercises.jr_exercises

import junit.framework.TestCase.assertEquals
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.BDDMockito.given
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.stubbing.Answer


class ValidCharTest{

    companion object{

        private var validChar: ValidChar? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            validChar = ValidChar()
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            validChar = null
        }
    }

    @Test
    fun validCharCharTest(){
        assertEquals(true, validChar!!.validChar('d'))
    }

    @Test
    fun validCharStringTest(){
        assertEquals(false, validChar!!.validChar("ab"))
    }

    @Test
    fun validCharIntTest(){
        assertEquals(false, validChar!!.validChar(5))
    }

    @Test
    fun validCharDoubleTest(){
        assertEquals(false, validChar!!.validChar(5.6))
    }
}


//--------------------


class GetCharacterCodeTest{

    companion object{
        @InjectMocks
        private var getCharacterCode: GetCharacterCode? = null

        @Mock
        private var validChar: ValidChar? = null

        @BeforeClass
        @JvmStatic
        fun setupCommon(){
            //MockitoAnnotations.initMocks(this)
            validChar = Mockito.mock(ValidChar::class.java)
            getCharacterCode = GetCharacterCode(validChar!!)
        }

        @AfterClass
        @JvmStatic
        fun tearDownCommon(){
            getCharacterCode = null
        }
    }

    @Test
    fun getCharacterCodeTest(){
        getCharacterCode!!.getCharacterCode('A')
        //verify that the method has been called
        Mockito.verify(validChar)!!.validChar('A')//only verify mocked object
        //here could go another line with an assert
    }

    @Test
    fun getCharacterCodeCorrectTest(){
        //Given
        given(validChar!!.validChar('A')).willReturn(true)//mocked object
        //When
        val result: Int = getCharacterCode!!.getCharacterCode('A')
        //Then
        Mockito.verify(validChar, Mockito.atLeastOnce())!!.validChar('A')//only verify mocked object
        assertEquals(65, result)

    }

    @Test
    fun getCharacterCodeWrongTest(){
        //Given
        given(validChar!!.validChar("A")).willReturn(false)//mocked object
        //When
        val result: Int = getCharacterCode!!.getCharacterCode("A")
        //Then
        Mockito.verify(validChar, Mockito.atLeastOnce())!!.validChar("A")
        assertEquals(0, result)

    }

    @Test
    fun argumentMatchersTrueTest(){
        //Given
        given(validChar!!.validChar(ArgumentMatchers.anyChar())).willReturn(true)//mocked object
        //When
        val result: Int = getCharacterCode!!.getCharacterCode('A')
        //Then
        assertEquals(65, result)

    }

    @Test
    fun argumentMatchersFalseTest(){
        //Given
        given(validChar!!.validChar(ArgumentMatchers.anyString())).willReturn(false)//mocked object
        //When
        val result: Int = getCharacterCode!!.getCharacterCode("A")
        //Then
        Mockito.verify(validChar, Mockito.atLeastOnce())!!.validChar(ArgumentMatchers.anyString())
        Mockito.verify(validChar, Mockito.never())!!.validChar(ArgumentMatchers.anyDouble())
        assertEquals(0, result)

    }

    @Test
    fun getCharacterCodeTrueTest2(){
        `when`(validChar!!.validChar('A')).thenReturn(true) //mocked object
        val validCharacter: Boolean = validChar!!.validChar('A')
        assertEquals(true, validCharacter)
    }

    @Test
    fun getCharacterCodeWithAnswerFalseTest(){
        //`when`(validChar!!.validChar("A")).thenReturn(false) //mocked object

        val answer : Answer<Boolean> = Answer{false}
        `when`(validChar!!.validChar("A")).thenAnswer(answer) //mocked object

        val validCharacter: Boolean = validChar!!.validChar("A")
        assertEquals(false, validCharacter)
    }

    //calling the real method:
    @Test
    fun realMethodTrueTest(){
        `when`(validChar!!.validChar('A')).thenCallRealMethod()
        assertEquals(true, validChar!!.validChar('A'))
    }

    @Test
    fun realMethodFalseTest(){
        //`when`(validChar!!.validChar("A")).thenCallRealMethod()
        given(validChar!!.validChar("A")).willCallRealMethod()
        assertEquals(false, validChar!!.validChar("A"))
    }

    @Test //without verification
    fun getCharacterCodeFalseTest3(){
        //Given
        given(validChar!!.validChar("A")).willReturn(false)
        //When
        val result: Boolean = validChar!!.validChar("A")
        //Then
        assertEquals(false, result)
    }

    @Test ////with verification
    fun getCharacterCodeFalseTest4(){
        //Given
        given(validChar!!.validChar("A")).willReturn(false)
        //When
        val result: Boolean = validChar!!.validChar("A")
        //Then
        Mockito.verify(validChar, Mockito.atLeastOnce())!!.validChar("A") // pay attention to the location of the first parentheses
        assertEquals(false, result)
    }
}

//valid number es una class con un metodo llamado check que filtra con un if si
// el valor ingresado es un entero.no acepta double,ni otro tipo de variable.
// devuelve true si el numero entero ingresado esta entre 0 y 9.si es mayor que 9,
// menor que 1 o es una letra devuelve false

//add es una clase que llama por parametro a valid number.contiene una funcion que hace
//suma de dos enteros pero antes de sumar los filtra usando el parametro validNumber:
//if(validNumber.check(a) && validNumber.check(b)){ return a + b}
//aca valid number es un parametro de Add.

//como valid number es lo que se pasa por parametro en Add, para testear add se
//hace un Mock de valid number.(mirar video 39)

//mirar video 42 para ver los valores por defecto (valores nice) que Mockito le
// da a las variables. si es boolean es false, si es entero es cero, si es colecciones
// es empty o null.para controlar esto se usa `when`:
//`when` (validNumber!!.check(3)).thenReturn(true)
//en este caso si no se hace con when el metodo mockeado va a traer un false porque es
//su respuesta por defecto.

//si se quiere usar el metodo real y no el mockeado se usa :
//`when`(validNumber.check(3).thenCallRealMethod()
//esto testea el parametro 3 con el metodo real.por lo tanto en este caso devuelve true.
//si pasamos otro numero diferente a 3 el test no pasa porque no hemos hecho el when
//correspondiente.ejemplo:
//assertEquals(true, validNumber.check(4)) //esto dara error