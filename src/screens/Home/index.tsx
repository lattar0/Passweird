import React from 'react';
import { View } from 'react-native';
import { Header } from '../../components/Header';
import { PasswordList } from '../../components/PasswordsList';
import { styles } from './styles';

export function Home() {
  return (
    <View style={styles.container}>
      <Header />
      <PasswordList />
    </View>      
  )
}