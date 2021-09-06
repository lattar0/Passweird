import React from 'react';
import { Button, Text, Touchable, TouchableOpacity, View } from 'react-native';
import { RectButton } from 'react-native-gesture-handler';
import { ButtonFooter } from '../../components/ButtonFooter';
import { Footer } from '../../components/Footer';
import { Header } from '../../components/Header';
import { theme } from '../../styles/theme';
import { styles } from './styles';

export function Passwords({ navigation }) {

  return (
    <View style={styles.container}>
      
      <Header />
      
      <View style={styles.main}>
        <Text style={styles.text}>Passwords</Text>
      </View>
      
      <Footer />
    
    </View>
  )
}